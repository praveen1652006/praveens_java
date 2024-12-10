package com.oops.interfaces.example_interface;

public class car1 {
    engine one=new electric_engine();
    player One=new cdplayer();
        public void startcar(){
            one.start();
        }
        public void stopcar(){
            one.stop();
        }

        public void start() {
            One.start();
        }
        public void stop() {
            One.stop();
        }
        public void changeengine(){
            this.one=new normalengine();
        }
}
