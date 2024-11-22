package co.edu.uniquindio.proyectofinal.model;

import java.time.LocalDateTime;

public class Mensaje {
    private String contenido;
    private LocalDateTime fechaEnvio;
    private Vendedor remitente; // Vendedor que envía el mensaje
    private Vendedor destinatario; // Vendedor que recibe el mensaje

    // Constructor
    public Mensaje(String contenido, LocalDateTime fechaEnvio, Vendedor remitente, Vendedor destinatario) {
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    // Métodos getter
    public Vendedor getDestinatario() {
        return destinatario;
    }

    public Vendedor getRemitente() {
        return remitente;
    }

    public String getContenido() {
        return contenido;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }
}
