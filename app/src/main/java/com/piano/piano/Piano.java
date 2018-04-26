package com.piano.piano;

import android.util.Pair;
import java.util.ArrayList;

public class Piano {
    private ArrayList<Triplet<String, Integer, Boolean>> notas;
    private int size;

    Piano(){
        notas = new ArrayList<>();

        notas.add(new Triplet <>("A0", R.raw.a0, false));
        notas.add(new Triplet <>("A#0", R.raw.as0, true));
        notas.add(new Triplet <>("B0", R.raw.b0, false));
        notas.add(new Triplet <>("C1", R.raw.c1, false));
        notas.add(new Triplet <>("C#1", R.raw.cs1, true));
        notas.add(new Triplet <>("D1", R.raw.d1, false));
        notas.add(new Triplet <>("D#1", R.raw.ds1, true));
        notas.add(new Triplet <>("E1", R.raw.e1, false));
        notas.add(new Triplet <>("F1", R.raw.f1, false));
        notas.add(new Triplet <>("F#1", R.raw.fs1, true));
        notas.add(new Triplet <>("G1", R.raw.g1, false));
        notas.add(new Triplet <>("G#1", R.raw.gs1, true));
        notas.add(new Triplet <>("A1", R.raw.a1, false));
        notas.add(new Triplet <>("A#1", R.raw.as1, true));
        notas.add(new Triplet <>("B1", R.raw.b1, false));
        notas.add(new Triplet <>("C2", R.raw.c2, false));
        notas.add(new Triplet <>("C#2", R.raw.cs2, true));
        notas.add(new Triplet <>("D2", R.raw.d2, false));
        notas.add(new Triplet <>("D#2", R.raw.ds2, true));
        notas.add(new Triplet <>("E2", R.raw.e2, false));
        notas.add(new Triplet <>("F2", R.raw.f2, false));
        notas.add(new Triplet <>("F#2", R.raw.fs2, true));
        notas.add(new Triplet <>("G2", R.raw.g2, false));
        notas.add(new Triplet <>("G#2", R.raw.gs2, true));
        notas.add(new Triplet <>("A2", R.raw.a2, false));
        notas.add(new Triplet <>("A#2", R.raw.as2, true));
        notas.add(new Triplet <>("B2", R.raw.b2, false));
        notas.add(new Triplet <>("C3", R.raw.c3, false));
        notas.add(new Triplet <>("C#3", R.raw.cs3, true));
        notas.add(new Triplet <>("D3", R.raw.d3, false));
        notas.add(new Triplet <>("D#3", R.raw.ds3, true));
        notas.add(new Triplet <>("E3", R.raw.e3, false));
        notas.add(new Triplet <>("F3", R.raw.f3, false));
        notas.add(new Triplet <>("F#3", R.raw.fs3, true));
        notas.add(new Triplet <>("G3", R.raw.g3, false));
        notas.add(new Triplet <>("G#3", R.raw.gs3, true));
        notas.add(new Triplet <>("A3", R.raw.a3, false));
        notas.add(new Triplet <>("A#3", R.raw.as3, true));
        notas.add(new Triplet <>("B3", R.raw.b3, false));
        notas.add(new Triplet <>("C4", R.raw.c4, false));
        notas.add(new Triplet <>("C#4", R.raw.cs4, true));
        notas.add(new Triplet <>("D4", R.raw.d4, false));
        notas.add(new Triplet <>("D#4", R.raw.ds4, true));
        notas.add(new Triplet <>("E4", R.raw.e4, false));
        notas.add(new Triplet <>("F4", R.raw.f4, false));
        notas.add(new Triplet <>("F#4", R.raw.fs4, true));
        notas.add(new Triplet <>("G4", R.raw.g4, false));
        notas.add(new Triplet <>("G#4", R.raw.gs4, true));
        notas.add(new Triplet <>("A4", R.raw.a4, false));
        notas.add(new Triplet <>("A#4", R.raw.as4, true));
        notas.add(new Triplet <>("B5", R.raw.b5, false));
        notas.add(new Triplet <>("C5", R.raw.c5, false));
        notas.add(new Triplet <>("C#5", R.raw.cs5, true));
        notas.add(new Triplet <>("D5", R.raw.d5, false));
        notas.add(new Triplet <>("D#5", R.raw.ds5, true));
        notas.add(new Triplet <>("E5", R.raw.e5, false));
        notas.add(new Triplet <>("F5", R.raw.f5, false));
        notas.add(new Triplet <>("F#5", R.raw.fs5, true));
        notas.add(new Triplet <>("G5", R.raw.g5, false));
        notas.add(new Triplet <>("G#5", R.raw.gs5, true));
        notas.add(new Triplet <>("A5", R.raw.a5, false));
        notas.add(new Triplet <>("A#5", R.raw.as5, true));
        notas.add(new Triplet <>("B5", R.raw.b5, false));
        notas.add(new Triplet <>("C6", R.raw.c6, false));
        size = notas.size();
    }
    public int getSize(){
        return size;
    }

    public String getName(int pos){
        if(pos <= size - 1){
            return notas.get(pos).getFirst();
        }
        else{
            return "";
        }
    }

    /*
    return -1 significa que está fuera de rango
     */
    public int getNota(int pos){
        if(pos <= size - 1){
            return notas.get(pos).getSecond();
        }
        else{
            return -1;
        }
    }

    public boolean isBlack(int pos){
        if(pos <= size - 1){
            return notas.get(pos).getThird();
        }
        else{
            return false;
        }
    }
}

class Triplet<T, U, V> {

    private final T first;
    private final U second;
    private final V third;

    Triplet(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }
    public V getThird() { return third; }
}
