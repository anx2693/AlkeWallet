package wallet;

class Main extends Usuario{

	public Main(long ID, String nombreUsuario) {
		super(ID, nombreUsuario);
		// TODO Auto-generated constructor stub
	}

	// Método para consultar Datos
    public void consultarDatos() {
        System.out.println("Datos del Usuario:");
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre Usuario: " + nombre);
        System.out.println("Datos de la cuenta:");
        cuenta.mostrarInformacion();
    }
}
