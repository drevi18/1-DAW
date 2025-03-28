public class pajaro{
        private String nombre;
        private int edad;
        private char color;
        private boolean domestico;
    
        public void setColor(char c){
            switch (c) {
                case 'a':case 'v': case'r':
                    color=c;
                    System.out.println("Color asignado correctamente");
                    break;
                default:
                    System.out.println("Color incorrecto");
            }
        }
        public char getColor(){
            return color;
        }
        public String getColorCadena(){
            String auxiliar="";
            switch (color) {
                case 'a': auxiliar= "Amarillo"; break;
                case 'v': auxiliar= "Verde"; break;
                case 'r': auxiliar= "Rojo"; break;
            }
            return auxiliar;
        }

        public void setEdad(int e){
            edad= e;
        }
        public int getEdad(){
            return edad;
        }
        }
    
    

