# agilans_project.py
import sys

# Directions: 0 = North, 1 = East, 2 = South, 3 = West
dir_map = {"north": 0, "east": 1, "south": 2, "west": 3}
turns = ["left", "right", "straight", "back"]

def move_direction(current_dir, turn):
    # Apply turn to current direction
    if turn == "left":
        return (current_dir + 1) % 4
    elif turn == "right":
        return (current_dir + 3) % 4
    elif turn == "straight":
        return current_dir
    elif turn == "back":
        return (current_dir + 2) % 4
    else:
        raise ValueError("Invalid turn")

def simulate_path(instructions, start=(0,0)):
    x, y = start
    direction = 0  # Initially facing north
    for turn, dist in instructions:
        direction = move_direction(direction, turn)
        if direction == 0:
            y += dist
        elif direction == 1:
            x += dist
        elif direction == 2:
            y -= dist
        elif direction == 3:
            x -= dist
    return (x, y)

def main():
    data = sys.stdin.read().strip().split()
    if not data:
        return
    it = iter(data)
    N = int(next(it))
    instructions = []
    for _ in range(N):
        turn = next(it)
        dist = int(next(it))
        instructions.append((turn, dist))
    start_x, start_y = int(next(it)), int(next(it))
    target_x, target_y = int(next(it)), int(next(it))
    target = (target_x, target_y)
    
    # Try changing each instruction's turn
    found = None
    for i in range(N):
        current_turn, dist = instructions[i]
        for alt_turn in turns:
            if alt_turn == current_turn:
                continue
            modified = instructions[:]
            modified[i] = (alt_turn, dist)
            end_pos = simulate_path(modified, (start_x, start_y))
            if end_pos == target:
                found = (current_turn, dist, alt_turn, dist)
                break
        if found:
            break
    
    if found:
        print("Yes")
        print(f"{found[0]} {found[1]}")
        print(f"{found[2]} {found[3]}")
    else:
        print("No")

if __name__ == "__main__":
    main()
