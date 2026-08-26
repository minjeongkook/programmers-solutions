def solution(board):
    answer = 0
    move = [(-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 1), (1, -1), (1, 0), (1, 1)]

    for y in range(len(board)):
        for x in range(len(board[y])):
            if board[y][x] == 1:
                for dy, dx in move:
                    ny, nx = y + dy, x + dx
                    if 0 <= ny < len(board) and 0 <= nx < len(board[ny]) and board[ny][nx] == 0:
                        board[ny][nx] = -1

    return sum(row.count(0) for row in board)
