package com.malu.blog.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.bridge.Message;
import org.hibernate.pretty.MessageHelper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class UploadFile {
    	

public static byte[] getFile(String path) throws IOException {
    ClassPathResource file = new ClassPathResource(path);
    byte[] imageBytes = null;
    try {
        imageBytes = org.springframework.util.StreamUtils.copyToByteArray(file.getInputStream());
    } catch (java.io.IOException e) {
        throw new IOException(MessageHelper.infoString("pas de ficher", e.getMessage()));
        // throw new IOException("Error cannot be opened because it does not exist");
        // return (new ResponseHelper(MessageHelper.noContent("File not found"), false),
        // HttpStatus.BAD_REQUEST);
    }
    if (imageBytes != null) {
        return imageBytes;
    } else {
        throw new IOException(MessageHelper.infoString("pas de ficher",""));
    }
}



public static void saveFile(String uploadDir, String fileName, MultipartFile multipartFile) throws IOException {
Path uploadPath = Paths.get("../webapps/ims/WEB-INF/classes/" + uploadDir);
Path uploadPath1 = null;
try (InputStream inputStream = multipartFile.getInputStream()) {
    Path uploadPathLocal = Paths.get("src/main/resources/");
    Path uploadPathLocal1 = Paths.get("target/classes/");
    if (Files.isDirectory(uploadPathLocal) && Files.isDirectory(uploadPathLocal1)) {
        uploadPath = Paths.get("src/main/resources/" + uploadDir);
        uploadPath1 = Paths.get("target/classes/" + uploadDir);
    }
    if (!Files.exists(uploadPath)) {
        Files.createDirectories(uploadPath);
        if (uploadPath1 != null) {
            Files.createDirectories(uploadPath1);
        }
    }
    if (!fileName.equalsIgnoreCase("") && fileName != null) {
        System.out.println("fdfffffffffffffffffffffffff"+fileName);

        Path filePath = uploadPath.resolve(fileName);
        System.out.println(filePath);
        Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
    }
} catch (Exception ioe) {
    throw new IOException(Message.WARNING.toString());
}
}

@PostMapping("/file/multfile")
public ResponseEntity<?> uploardMulti(@RequestParam("file") MultipartFile[] file) throws IOException {
int id = 1;
Path path = Files.createDirectories(Paths.get("src/main/resources/fichiers/" + id));//pour creer le nouveau dossier avec l'id de utilisateur
List<Path> list = new ArrayList<>();
try {

    for (MultipartFile fil : file) {
        InputStream inputStream = fil.getInputStream();
        String filename = fil.getOriginalFilename();
        // Path path= Paths.get("src/main/resources/fichiers/"); //les chemair de recources/fichiers
        String pathAdd = filename; //les fichier qu'on va ajouter dans les path. on peut utiliser id ou pas

        Path pathComplet = path.resolve(pathAdd);//completer les nom du fichier ou image
        //   File fil=new File(id);
        //   fil.createNewFile();
        Files.copy(inputStream, pathComplet, StandardCopyOption.REPLACE_EXISTING);
        list.add(pathComplet); //pour retourner les resultats
    }
    return new ResponseEntity<>(list, HttpStatus.OK);

} catch (IOException e) {
    // throw new IOException("erreur "+filename,e);
    return new ResponseEntity<>(e, HttpStatus.OK);
}
}

@DeleteMapping("/file/delete")
public ResponseEntity<?> deleteFile() {
int userId = 1;
String filename = "IMG_1188.png";
Path path = Paths.get("src/main/resources/fichiers/" + userId + "/" + filename);
try {
    Files.deleteIfExists(path);
    return new ResponseEntity<>("ficher supprimer", HttpStatus.OK);
} catch (IOException e) {

    return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
}
}

}
