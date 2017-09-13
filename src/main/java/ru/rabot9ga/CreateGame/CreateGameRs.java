package ru.rabot9ga.CreateGame;

import commons.Status;

import java.util.UUID;


public class CreateGameRs {
    private UUID uuid;
    private Status status;
    private String StatusMessage;
    private String idGame;

    public UUID getUuid() {
        return uuid;
    }

    public CreateGameRs setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public CreateGameRs setStatus(Status status) {
        this.status = status;
        return this;
    }

    public String getStatusMessage() {
        return StatusMessage;
    }

    public CreateGameRs setStatusMessage(String statusMessage) {
        StatusMessage = statusMessage;
        return this;
    }

    public String getIdGame() {
        return idGame;
    }

    public CreateGameRs setIdGame(String idGame) {
        this.idGame = idGame;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateGameRs{");
        sb.append("uuid=").append(uuid);
        sb.append(", status=").append(status);
        sb.append(", StatusMessage='").append(StatusMessage).append('\'');
        sb.append(", idGame='").append(idGame).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
