class Brass extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Brass.play()"+n);
    }

    void adjust(){
        System.out.println("Adjusting Brass");
    }
}