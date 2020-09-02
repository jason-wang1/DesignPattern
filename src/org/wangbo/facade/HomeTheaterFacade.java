package org.wangbo.facade;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年09月02日
 *
 * @author WangBo
 * @version 1.0
 */
public class HomeTheaterFacade {

    // 定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    // 操作分成4步
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.off();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play(){
        dvdPlayer.play();

    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.on();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }

}
