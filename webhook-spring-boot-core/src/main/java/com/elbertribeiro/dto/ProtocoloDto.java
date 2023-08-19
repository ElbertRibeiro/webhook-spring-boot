package com.elbertribeiro.dto;

public class ProtocoloDto {
    private String id;
    private String title;
    private String description;
    private String status;

    private UsuarioDto assignedTo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UsuarioDto getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(UsuarioDto assignedTo) {
        this.assignedTo = assignedTo;
    }
}
