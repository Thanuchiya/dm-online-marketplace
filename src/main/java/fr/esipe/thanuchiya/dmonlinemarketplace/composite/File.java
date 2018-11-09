package fr.esipe.thanuchiya.dmonlinemarketplace.composite;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class File {
    // Real files
    private String name;
    private Date creationDate;
    private Long size;

    // Directories
    private boolean folder;
    private Set<File> files = new HashSet<>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public boolean isFolder() {
        return folder;
    }

    public void setFolder(boolean folder) {
        this.folder = folder;
    }

    public Set<File> getFiles() {
        return files;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", size=" + size +
                ", folder=" + folder +
                ", files=" + files +
                '}';
    }

    public static void main (String [] args) {
        File file1= new File();
        file1.setName("notes .xls");
        //file.setSize(0L);

        File file2= new File();
        file2.setName("controle.doc");

        File directory1= new File();
        directory1.getFiles().add(file1);
        directory1.getFiles().add(file2);

        File directory2 = new File();
        directory2.setName("subdirectory");
        directory2.setFolder(true);
        directory2.getFiles().add(file2);
        directory2.getFiles().add(file1);

        directory1.getFiles().add(directory2);

        for (File f : directory1.getFiles()) {
            System.out.println(f);
        }

    }
}

