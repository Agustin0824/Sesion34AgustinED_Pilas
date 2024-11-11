
package colachatbot;


public class ChatBot {
    
    public String generaRespuesta(String pregunta){
        pregunta = pregunta.toLowerCase();
        
        if (pregunta.contains("hola")) {//para saludar
            return "¡Hola Soy IA mi creador es AGUSTIN!. ¿Como puedo ayudarte?";
        } else if (pregunta.contains("¿como estas?")){
            return "Estoy aquí para ayudarte. ¿En que necesitas ayuda?";
        }else if(pregunta.contains("Tu nombre")){
            return "Soy una maquina inteligente especialista en programación en JAVA";
        }else if(pregunta.contains("¿que puedes hacer?")){
            return "Puedo programar en forma estructurada, 00, OE, OA, RX y más"
                    + "\nAdemas de responder preguntas y gestionar"
                    + "\nConsultas en orden de llegada";
        }else if(pregunta.contains("hola")){
            return "Aun no tengo esa programación, puedes preguntar otra cosa";
        }else{
            return "No entiendo tu pregunta, puedes preguntar de otra forma";
        }
    }  
}//termina clase

