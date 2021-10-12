import com.sun.scenario.effect.impl.prism.ps.PPSBlend_MULTIPLYPeer;

import javax.sound.midi.Soundbank;

/**
 * @author BianWenKai
 * @DATE 2021/10/12 - 9:58
 **/
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
