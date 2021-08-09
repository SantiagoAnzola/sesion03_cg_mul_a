
package sesion03_mul_a;

public class Esferica {

    private float r, alpha, theta;

    public Esferica(float r, float alpha, float theta) {
        this.r = r;//Distancia desde el origen al punto p
        this.alpha = alpha;//Angulo entre z y el punto p ó angulo del vector formado por el punto y el origen con respecto al eje z 
        this.theta = theta;//Angulo respecto X de la proyección del punto sobre el plano XY
    }

    public Esferica() {

    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public float getTheta() {
        return theta;
    }

    public void setTheta(float theta) {
        this.theta = theta;
    }

}
