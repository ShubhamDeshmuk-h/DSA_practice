import java.util.*;
import java.io.*;

public class BowlPerimeter {

    static class Point {
        int x, y;
        Point(int a, int b) {
            x = a;
            y = b;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> pts = new ArrayList<Point>();

        for (int i = 0; i < n; i++) {
            int px = sc.nextInt();
            int py = sc.nextInt();
            pts.add(new Point(px, py));
        }
        sc.close();

        // Sort by x, then y
        Collections.sort(pts, new Comparator<Point>() {
            public int compare(Point p1, Point p2) {
                if (p1.x != p2.x) return p1.x - p2.x;
                return p1.y - p2.y;
            }
        });

        // Build lower hull only
        List<Point> hull = new ArrayList<Point>();
        for (Point p : pts) {
            while (hull.size() >= 2 &&
                   cross(hull.get(hull.size()-2), hull.get(hull.size()-1), p) <= 0) {
                hull.remove(hull.size()-1);
            }
            hull.add(p);
        }

        // Calculate perimeter of lower hull
        double per = 0.0;
        for (int i = 0; i < hull.size() - 1; i++) {
            per += dist(hull.get(i), hull.get(i+1));
        }

        int ans = (int)Math.round(per);
        System.out.println(ans);
    }

    static long cross(Point a, Point b, Point c) {
        return (long)(b.x - a.x) * (c.y - a.y) -
               (long)(b.y - a.y) * (c.x - a.x);
    }

    static double dist(Point p1, Point p2) {
        long dx = p1.x - p2.x;
        long dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
