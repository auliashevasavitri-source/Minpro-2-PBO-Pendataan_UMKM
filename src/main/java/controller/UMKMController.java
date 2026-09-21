package controller;

import java.util.ArrayList;
import model.UMKM;

public class UMKMController {

    private ArrayList<UMKM> daftarUMKM;

    public UMKMController() {
        daftarUMKM = new ArrayList<>();
    }

    public ArrayList<UMKM> getDaftarUMKM() {
        return daftarUMKM;
    }

    public void tambahUMKM(UMKM umkm) {
        daftarUMKM.add(umkm);
    }

    public UMKM cariUMKM(int id) {
        for (UMKM umkm : daftarUMKM) {

            if (umkm.getIdUMKM() == id) {
                return umkm;
            }
        }

        return null;
    }

    public boolean hapusUMKM(int id) {

        for (int i = 0; i < daftarUMKM.size(); i++) {

            if (daftarUMKM.get(i).getIdUMKM() == id) {
                daftarUMKM.remove(i);
                return true;
            }
        }

        return false;
    }
}