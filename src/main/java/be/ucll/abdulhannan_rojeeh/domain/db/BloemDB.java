package be.ucll.abdulhannan_rojeeh.domain.db;

import be.ucll.abdulhannan_rojeeh.domain.model.Bloem;

import java.util.ArrayList;
import java.util.List;

public class BloemDB {
    private int sequence = 0;
    private final List<Bloem> bloemen = new ArrayList<>();

    public BloemDB() {

    }

    public void add(Bloem bloem) {
        if(bloem == null)throw new IllegalArgumentException("Er is geen bloem toegevoegd");
        if(find(bloem.getId()) != null)throw new IllegalArgumentException("bloem met opgegeven id bestaat al");
        if(find(bloem.getNaam()) != null)throw new IllegalArgumentException("bloem met opgegeven naam bestaat al");
         bloem.setId(sequence);
        this.sequence++;
        bloemen.add(bloem);

    }

    public void verwijder(Bloem bloem) {
        if(bloem == null)throw new IllegalArgumentException("Er is geen bloem toegevoegd");
        bloem.setId(sequence);
        bloemen.remove(bloem);

    }


    public Bloem find(int id){
        for(Bloem b : bloemen)
            if(b.getId() == id)return b;
        return null;
    }

    public Bloem find(String naam){
        for(Bloem b : bloemen)
            if(b.getNaam() == naam)return b;
        return null;
    }

    public List<Bloem> getBloemen() {
        return bloemen;
    }
    public int getSequence(){
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void vervangNaam(String naam){
        for(Bloem b : bloemen){
           if(b.getNaam() == naam)throw new IllegalArgumentException("");
            b.getNaam().replace(b.getNaam(),naam);
        }
        }

    public void vervangKleur(String kleur){
        for(Bloem b : bloemen){
            if(b.getKleur() == kleur)throw new IllegalArgumentException("");
            b.getNaam().replace(b.getNaam(),kleur);
        }
    }

    public int getMeesteVerkochtBloem(){
        int res = 0;
        for (int i = 0; i< bloemen.size(); i++){
            if(bloemen.get(i).getAantal() > res){
                res = i;
            }
        }

        return res;
    }
}
