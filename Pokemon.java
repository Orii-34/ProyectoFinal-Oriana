public class Pokemon{
    private String tipos;
    private int estadisticas;
    private String nombre;
    private int nivel;
    private int nivAmistad;

    public String getTipos(){
        return tipos;
    }

    public int getEstadisticas(){
        return estadisticas;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNivel(){
        return nivel;
    }

    public int getNivAmistad(){
        return nivAmistad;
    }

    public void setEstadisticas(int estadisticas){
        if (estadisticas >= 0){
            this.estadisticas = estadisticas;
        }else {
            System.out.println("Estadística inválida");
        }
    }

    public void setNivel(int nivel){
        if (nivel >= 0){
            this.nivel = nivel;
        }else{
            System.out.println("Nivel inválido");
        }
    }

    public void setNivAmistad(int nivAmistad){
        if (nivAmistad >= 0){
            this.nivAmistad = nivAmistad;
        }else{
            System.out.println("Nivel inválido");
        }
    }

    public void mostrarEvolucion(){
        if (nivel >= 16){
            System.out.println("Tu pokémon a evolucionado");
        }else if (nivAmistad >= 220){
            System.out.println("Tu pokémon a evolucionado");
        }else{

        }
    }


}