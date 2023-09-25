/**
* <h1>SmartTv</h1>
* A SmartTv contém características e funcionalidades de tv inteligente
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Daniel Carlos Barbosa
* @version 1.0
* @since   25/09/2023
*/
public class SmartTv{
    boolean ligada=false;
    int canal=1;
    int volume=25;

    /**
     * Esse método foi criado para ligar a TV
     */
    public void ligar(){
        ligada=true;
    }
    /**
     * Esse método foi criado para desligar a TV
     */
    public void desligar(){
        ligada=false;
    } 
    /**
     * Esse método foi criado para aumentar o volume da TV
     */    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }     
    /**
     * Esse método foi criado para diminuir o volume da TV
     */    
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    /**
     * Esse método foi criado para mudar de canal
     * @param novoCanal é o número do canal que o usuário deseja assistir
     */
     public void mudarCanal(int novoCanal){
        if (canal == novoCanal){
            System.out.println("A TV já está nesse mesmo canal");
            return;
        }
        while (canal > novoCanal){
            diminuirCanal();
        }

        while (canal < novoCanal){
            aumentarCanal();
        }        

        canal = novoCanal;        

        System.out.println("Canal alterado para: " + canal);
    } 
    /**
     * Esse método foi criado para aumentar o canal, um por vez
     */    
     private void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal... " + canal);
    }     
    /**
     * Esse método foi criado para diminuir o canal, um por vez
     */        
     private void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal... " + canal);
    }         
}