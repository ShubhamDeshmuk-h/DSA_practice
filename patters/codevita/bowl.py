# bowl.py
import sys
import math

def cross(ax, ay, bx, by, cx, cy):
    return (bx - ax) * (cy - ay) - (by - ay) * (cx - ax)

def dist(x1, y1, x2, y2):
    return math.hypot(x2 - x1, y2 - y1)

def main():
    try:
        data = sys.stdin.read().strip().split()
        if not data:
            print(0)
            return

        it = iter(data)
        try:
            n = int(next(it))
        except (StopIteration, ValueError):
            print(0)
            return

        points = []
        for i in range(n):
            try:
                x = int(next(it))
                y = int(next(it))
                points.append((x, y))
            except (StopIteration, ValueError):
                break

        if len(points) < 2:
            print(0)
            return

        # remove duplicates
        points = sorted(set(points))
        if len(points) < 2:
            print(0)
            return

        # lower hull
        hull = []
        for px, py in points:
            while len(hull) >= 2 and cross(hull[-2][0], hull[-2][1],
                                          hull[-1][0], hull[-1][1],
                                          px, py) <= 0:
                hull.pop()
            hull.append((px, py))

        if len(hull) < 2:
            print(0)
            return

        # perimeter of open polyline
        total = 0.0
        for i in range(len(hull) - 1):
            total += dist(hull[i][0], hull[i][1], hull[i+1][0], hull[i+1][1])

        ans = int(math.floor(total + 0.5))
        print(ans)

    except Exception:
        # if any unexpected error happens, print 0
        print(0)

if __name__ == "__main__":
    main()
