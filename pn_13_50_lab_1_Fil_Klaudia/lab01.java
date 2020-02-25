public class lab01{
    
    public static void main(String[] args){
        draw_line(28,65,28,84);
        draw_line(28,84,34,83);
        draw_line(34,83,38,79);
        draw_line(38,79,37,76);
        draw_line(37,76,34,73);
        draw_line(28,72,37,76);
        draw_line(58,25,53,23);
        draw_line(53,23,47,23);
        draw_line(47,23,44,25);
        draw_line(74,65,63,65);
        draw_line(63,65,73,74);
        draw_line(73,74,73,79);
        draw_line(73,79,70,82);
        draw_line(70,82,66,82);
        draw_line(66,82,63,80);
        draw_circle(50,74,9);
        draw_circle(50,29,14);
        draw_circle(55,34,2);
        draw_circle(46,34,2);
    } 

    public static void draw_line(int x1, int y1,int x2,int y2)
    {
        double step = 100;
        double dx = (x2-x1)/step;
        double dy = (y2-y1)/step;

        for(double i = 0; i <step ; i+=0.1)
            System.out.println( (x1 + i*dx ) + " " + (y1 + i*dy));

    }   

    public static void draw_circle(int x0, int y0, int r)
    {
        for(double alpha = 0.0; alpha < 2*Math.PI ; alpha += 0.1)
            System.out.println( (x0 + Math.cos(alpha)*r) + " " + (y0 + Math.sin(alpha)*r) );
    }

}