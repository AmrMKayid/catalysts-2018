def points(x0, y0, x1, y1):
    dx = x1 - x0
    dy = y1 - y0

    xsign = 1 if dx > 0 else -1
    ysign = 1 if dy > 0 else -1

    dx = abs(dx)
    dy = abs(dy)

    if dx > dy:
        xx, xy, yx, yy = xsign, 0, 0, ysign
    else:
        dx, dy = dy, dx
        xx, xy, yx, yy = 0, ysign, xsign, 0

    D = 2 * dy - dx
    y = 0

    for x in range(dx + 1):
        output = "" + str(x0 + x * xx + y * yx) + " " + str(y0 + x * xy + y * yy) + " "
        output_file.write(output)
        if D >= 0:
            y += 1
            D -= 2 * dx
        D += 2 * dy


if __name__ == '__main__':
    t = int(input())
    output_file = open('output2.txt', 'w')
    while t > 0:
        x0, y0, x1, y1 = input().split(" ")
        points(int(x0), int(y0), int(x1), int(y1))
        output_file.write("\n")
        t -= 1
    output_file.close()
