package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private List<Path> foundFiles = new ArrayList<>();
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    boolean partOfContentCheck;
    boolean minSizeCheck;
    boolean maxSizeCheck;
    boolean partOfNameCheck;

    public SearchFileVisitor() {
        partOfName = null;
        partOfContent = null;
        minSize = 0;
        maxSize = 0;
        minSizeCheck = false;
        maxSizeCheck = false;
        partOfNameCheck = false;
        partOfContentCheck = false;
    }
    public void setMinSize(int minSize) {
        this.minSize = minSize;
        this.minSizeCheck = true;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        this.maxSizeCheck = true;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
        this.partOfContentCheck = true;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
        this.partOfContentCheck = true;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (partOfName != null && !file.getFileName().toString().contains(partOfName)) return FileVisitResult.CONTINUE;

        byte[] content = Files.readAllBytes(file);

        if ((maxSize > 0 && content.length > maxSize) || (minSize > 0 && content.length < minSize)) return FileVisitResult.CONTINUE;

        if (partOfContent != null && !partOfContent.isEmpty()) {
            String contentString = new String(content);
            if (!contentString.contains(partOfContent)) return FileVisitResult.CONTINUE;
        }

        foundFiles.add(file);
        return super.visitFile(file, attrs);
    }
}
