/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorteo;

import JuegoSorteo.vistaPrincipal;
import java.util.Random;
import javax.swing.ImageIcon;

public class Imagen2 extends Thread{
boolean activo=true;
Random img = new Random();
Random tiem = new Random();
int i=0;
int tiempo=0;
int c=0;
@Override
public void run(){
while(activo==true){
i=img.nextInt(4);
tiempo=tiem.nextInt(100);
if(i==1){
vistaPrincipal.dos.setIcon(new ImageIcon(vistaPrincipal.img1));
c=1;
}
if(i==2){
vistaPrincipal.dos.setIcon(new ImageIcon(vistaPrincipal.img2));
c=2;
}
if(i==3){
vistaPrincipal.dos.setIcon(new ImageIcon(vistaPrincipal.img3));
c=3;
}
try{
sleep(tiempo);
}catch(InterruptedException e){}
}
}
}