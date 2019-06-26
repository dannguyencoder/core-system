package com.vinhnq21.core.cms.util;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.vinhnq21.core.cms.controller.FileController.BASE_DOWNLOAD_PATH;

public class FileUtils {

    public static List<File> getAllFilesInDirectory(String pathToDirectory) {
        try {
            List<File> filesInFolder = Files.walk(Paths.get(pathToDirectory))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            return filesInFolder;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<String> getAllFileNamesInDirectory(String pathToDirectory) {
        try {
            List<String> fileNamesInFolder = Files.walk(Paths.get(pathToDirectory))
                    .filter(Files::isRegularFile)
                    .map(path -> path.toFile().getName())
                    .collect(Collectors.toList());

            return fileNamesInFolder;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<String> getAllFileDownloadLinksInDirectory(String pathToDirectory) {

        try {
            List<String> fileNamesInFolder = Files.walk(Paths.get(pathToDirectory))
                    .filter(Files::isRegularFile)
                    .map(path -> ServletUriComponentsBuilder.fromCurrentContextPath()
                            .path("/" + BASE_DOWNLOAD_PATH + "/")
                            .path(path.toFile().getName())
                            .toUriString())
                    .collect(Collectors.toList());

            return fileNamesInFolder;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
