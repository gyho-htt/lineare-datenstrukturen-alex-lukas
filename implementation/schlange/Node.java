public class Node{
    private Node nf;
    private Bestellbest inhalt;
    
    public Node(Bestellbest pInhalt){
        this.inhalt = pInhalt;
        //this.nf = null;  (Attribute werden automatisch beim Erzeugen auf null gesetzt, kann man weglassen)
    }
    
    public Bestellbest getInhalt(){
        return this.inhalt;
    }
    
    public Node getNF(){
        return this.nf;
    }
    
    public void setNF(Node pNF){
        this.nf = pNF;
    }

}
