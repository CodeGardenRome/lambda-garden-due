package lg2;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class LambdaGardenDue {

    static class Cella{
        public Cella(int x, int y){
            this.x=x;
            this.y=y;
        }
        public int x,y;

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof Cella))return false;
            Cella altra = (Cella)obj;
            return this.x==altra.x && this.y==altra.y;
        }

        @Override
        public String toString() {
            return "x: " + x + ", y: " + y;
        }
    }

    static final Cella CELLA_ZERO = new Cella(0,0);

    public Character aggrega(Character a, Character b){
        return 'A';
    }

    public char vincitore(Character[] riga){
        return 'A';
    }

    public Cella cellaSuccessivaRighe(Cella c){
        return new Cella(-1,-1);
    }

    public Cella cellaSuccessivaColonne(Cella c){
        return new Cella(-1,-1);
    }

    public Cella cellaSuccessivaDiagonaleMaggiore(Cella c){
        return new Cella(-1,-1);
    }

    public Cella cellaSuccessivaDiagonaleMinore(Cella c){
        return new Cella(-1,-1);
    }

    Optional<Character> estrai(Character[][] partita, Cella cella){
        return Optional.empty();
    }


    public Character[] generaVettore(Character[][] partita, Cella inizio, UnaryOperator<Cella> successore){
        return new Character['A'];
    }

    public Stream<Character> generaStream(Character[][] partita, Cella inizio, UnaryOperator<Cella> successore){
        return Stream.empty();
    }

    public Character aggregaVincitore(Character a, Character b){
        return 'A';
    }

    public Character trovaVincitoreRighe(Character[][] partita){
        return 'A';
    }

    public Character trovaVincitoreColonne(Character[][] partita){
        return 'A';
    }


    public Character trovaVincitoreDiagonaleMaggiore(Character[][] partita){
        return 'A';
    }

    public Character trovaVincitoreDiagonaleMinore(Character[][] partita){
        return 'A';
    }

    public Character vincitoreMatrice(Character[][] partita){
        return 'A';
    }
}