public class PolarPoint {

    private double rho;
    private double phi;

    PolarPoint(double rho,
                       double phi) {

        this.phi = phi;
        this.rho = rho;
    }

    double getRho() {
        return this.rho;
    }

    double getPhi() {
        return this.phi;
    }

    Point toCartesin() {
        double convertFromX = this.rho * Math.cos(this.phi);
        double convertFromY = this.rho * Math.sin(this.phi);

        return new Point(convertFromX, convertFromY);
    }
}