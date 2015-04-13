(ns tictactoe.game)
(use '[tictactoe.board])

(declare play-game)
(declare play-turn)
(declare game-over?)

(defn play-game[board print-board player-move]
  (loop [current-board board]
      (print-board current-board)
      (if (game-over? current-board)
        current-board
        (recur (play-turn current-board player-move))))) 

(defn play-turn [board player-move]
  (add-move board (player-move)))

(defn game-over? [board]
  (or (won? board) (draw? board)))
