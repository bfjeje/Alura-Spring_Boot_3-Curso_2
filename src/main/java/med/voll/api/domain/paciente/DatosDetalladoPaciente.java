package med.voll.api.paciente;

import med.voll.api.direccion.Direccion;

public record DatosDetalladoPaciente(String nombre, String email, String telefono, String documentoIdentidad, Direccion direccion) {

    public DatosDetalladoPaciente(Paciente paciente) {
        this(paciente.getNombre(), paciente.getEmail(), paciente.getTelefono(), paciente.getDocumento_identidad(), paciente.getDireccion());
    }
}
