public class Pokemon{
    private String tipo;
    private int estadistica;
    private String nombre;
    private int nivel;
    private int nivAmistad;
    private int vida;
    private int fuerza;

    public String getTipo(){
        return tipo;
    }

    public int getEstadistica(){
        return estadistica;
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

    public int getVida(){
        return vida;
    }

    public int getFuerza(){
        return fuerza;
    }

    public void setEstadistica(int estadistica){
        if (estadistica >= 0){
            this.estadistica = estadistica;
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

    public void setVida(int vida){
        if (vida >= 1){
            this.vida = vida;
        }else{
            System.out.println("Vida inválida");
        }
    }

    public void setFuerza(int fuerza){
        if (fuerza >= 10){
            this.vida = vida;
        }else{
            System.out.println("Fuerza inválida");
        }
    }

    public void mostrarEvolNivel(){
        if (nivel >= 16){
            System.out.println("Tu pokémon a evolucionado");
        }else if (nivel >= 32){
            System.out.println("Tu pokémon a evolucionado");
        }else{

        }
    }

    public void mostrarEvolAmistad(){
        if (nivAmistad >= 220){
            System.out.println("Tu pokémon a evolucionado");
        }else{

        }
    }
}