# Project 3: Build a Game With AI

**AP Computer Science A | Semester 1 | 30 points | Individual**

*Every date for this project lives on Canvas: when the work days are, when the code is due, and when you present. Check there.*

## The short version

Build a game in Java. Pick one from the list at the end of this handout or pitch your own. Its board, deck or map lives in an array. Use AI as a pair programmer the whole way, exactly like Project 1: Claude, ChatGPT, Copilot, whatever you like.

**Then show it to me. If there is class time, you present it to everyone. If not, you walk me through it at my desk. Either way you will play it, walk through your own code, make one small change while I watch, and answer questions.**

This time most of the points are for the game itself. The deal from last time has not changed, though: code in your file that you cannot explain does not count.

## What is different from Project 1

Four things.

* You have arrays now. The no-arrays rule is gone and the opposite replaces it: your game has to be built on one.
* You are building a game, so real data from your own life no longer fits. Rule 1 is now a house rule you invent.
* Every project gets a live change. I name one small edit and you make it with AI closed. If the code is yours, it takes about thirty seconds.
* Most of the points are for the program now.

## What you are allowed to build

### Your program must be

* A game that runs in the console. Text in, text out is the minimum. Graphics are allowed but never required (see below).
* Built on an array. The board, deck, map or minefield lives in an array you declared. See the array rule.
* Interactive, with real decisions. The player chooses something every turn, and the choice changes what happens.
* Playable to an ending. Someone wins, loses or draws, and the program says so.
* Between about 200 and 400 lines, spread across three to five classes.
* Readable. Clear names, private instance variables, and a short comment above every method saying what it does.
* Able to survive bad input. If it asks for a column and gets "banana", or gets 9 on a board with 7 columns, it says something useful and asks again. An `ArrayIndexOutOfBoundsException` in the middle of your demo costs you.

### Your program must not be

* Your Project 1 idea again, in any form. New idea, new classes, new repo. Nothing copied over.
* A tutorial you followed. If searching a phrase from your program finds the source, it is not yours.
* Something we already built in class. No Game of Life, no MasterMind, nothing that already has a GitHub assignment.
* Too small to talk about. Plain 3x3 Tic-Tac-Toe, Rock Paper Scissors, Hangman and guess-the-number are a method, not a project. A 5x5 maze is not a maze.
* Pure chance with no decisions. A slot machine is not a game you play.
* Dependent on files or the internet. No reading from disk, no downloading, no libraries outside `java.util` (plus `java.awt` and `javax.swing` if you add graphics).

## The array rule

**Your game's state lives in an array, and your code walks it with loops.**

* At least one array (a `[]` or a `[][]`) holds the real state of the game: the board, the deck, the map. A side array of three menu options does not count.
* At least three different methods loop through it. For example: print the board, check for a winner, count what is left.
* ArrayList is welcome alongside it (a discard pile, a move history), but a real array sits at the center. A deck can be a `Card[52]` with an int that marks the top card.

You may use everything we have covered: classes, constructors, methods, conditionals, loops, Strings, Scanner, Math, arrays, 2D arrays, ArrayList and for-each loops. Nothing past that.

Here is the trap, same as last time. AI does not know what we have covered. Ask it for a game and within a minute it will hand you a HashMap, an enum, a lambda with `->`, a stream, a record or a try/catch. When that happens, tell it exactly this:

```
"Rewrite this using only classes, methods, loops, conditionals,
 Strings, arrays, 2D arrays and ArrayList. No HashMap, enum,
 record, lambdas, streams or try/catch."
```

It will comply. Rewriting that code is not busywork. Deciding what one cell of your array holds, and writing the loops that read it, is the assignment.

**Code in your file that you cannot account for scores zero on that line. "The AI wrote that part" is not an answer.**

## Graphics are optional

The console is the minimum. If you want more, you may draw your game with the Turtle and World classes from our turtle unit, or build a Swing window. Know what you are signing up for.

* Build the console version first and commit it. Add graphics only once the game works.
* We have not covered Swing in class. If you use it, you are choosing to explain code we never studied, and every graphics line is fair game in questions like everything else.
* Graphics earn no extra points. A clean console game you understand completely outscores a window you cannot explain.

## Three rules that make this yours

These exist for the same reason as last time. Every game on the list has been coded ten thousand times, and any AI can produce a standard version in seconds. Each rule makes your project impossible to generate from this handout alone.

### 1. Your game must have a house rule you invented

**Add at least one rule, piece, square or move that is not in the standard game and that you made up yourself. Write it in section 3 of `REFLECTION.md` and push that as your first commit, before you write any game code.**

It has to change the logic, not the look. A new kind of square, a piece that moves differently, a board that changes shape, a move that affects a whole row or column. Renaming the pieces or changing their colors is not a house rule.

For a sense of size: a Connect Four piece that clears its whole column once per game. Minesweeper with three lives, where hitting a mine costs one. A checkers king that can slide two squares. Those three are taken.

You will describe your house rule in `REFLECTION.md` and name the methods that make it work. When you present, I will ask you to show it in play, then point to the lines that make it happen.

### 2. One method must be written with no AI at all, and it must walk your array

Pick a method that loops through your array: a win check, a neighbor count, a board printer, a search. Write it completely yourself: no AI, no autocomplete suggestions accepted. Put this comment directly above it:

```java
// NO AI: written entirely by me
```

It needs to be real: more than five lines, with a loop over your array and at least one conditional inside it. When you present, I will ask why you picked that one, then hand you a small board and ask you to trace it.

### 3. Your commit history must show real work

Same as Project 1. Push to your repo as you go: at least five commits across at least three different days, with messages that say what actually changed ("added the diagonal win check," not "update").

**One enormous commit the night before the deadline tells me the whole program appeared at once, and I will aim my questions at the parts you understand least.**

## What to submit

Everything lives in your GitHub repo, pushed by the deadline on Canvas:

* Your .java files in `src/main/java/`
* `REFLECTION.md`, filled in. The template is already in your repo.
* Your commit history, which you build by working normally.

*You do not need to submit your AI transcripts. I am not going to audit them. The presentation is the audit.*

## The presentation (or code check)

If there is class time, you get about six minutes in front of the class with your code on the screen. You drive. The shape of it:

* Play it and show us your house rule in action (about 1 minute)
* Walk us through your array: what one cell holds, how it gets filled at the start, and one method that loops through it (about 1 minute)
* Walk us through your no-AI method, line by line (about 1 minute)
* The live change: I name one small edit, you make it with AI closed and run it (about 1 minute)
* Take questions from me and from the class (about 2 minutes)

### No time to present?

If there is not time for everyone, the presentation becomes a code check at my desk: about three minutes, just you and me. You show me your house rule in play, make the live change, and answer two or three questions about your array and your no-AI method. It is worth the same points either way.

### The live change

I pick something small, one to three lines, that the person who wrote the code could do in under a minute. Your IDE stays open, AI stays closed, and you can talk it through out loud while you work. The size I mean:

```
"Make the board one column wider."
"Print how many pieces each player has left after every turn."
"End the game after 30 moves."
"Change the symbol for an empty square."
```

If you cannot finish it, tell us exactly which lines would need to change and why. That earns partial credit. Freezing does not.

**"I do not know, but here is how I would find out" is a real answer and earns partial credit. Bluffing does not.**

If we do present as a class, watching everyone else is part of the assignment. Five classmates will solve the win check five different ways, and you will learn more from that than from anything I could put on a slide.

## Grading, 30 points

| Category | Points | What earns full marks |
|---|---|---|
| It works | 6 | Compiles, runs, plays to an ending, does what `REFLECTION.md` says, survives bad input and out-of-range moves. |
| The array | 5 | The real game state lives in an array, and three or more methods loop through it correctly without going out of bounds. |
| House rule | 4 | Invented by you, changes the logic and not just the look, works in play, and was in `REFLECTION.md` before the game code. |
| No-AI method | 2 | Marked with the comment, more than five lines, loops over your array with a conditional inside, and works. |
| Style and comments | 2 | Clear names, private instance variables, a comment above every method. |
| Boundaries | 2 | Console game, 200 to 400 lines in three to five classes, only what we have covered, a new idea from Project 1, nothing from the "must not" list. |
| Commit history | 2 | Five or more commits across three or more days, with messages that say what changed. |
| `REFLECTION.md` | 3 | Every question answered in your own words: house rule, array, no-AI method, and where AI helped. |
| Presentation or code check | 4 | You explain what you are asked about in your own words, trace your array code out loud, and make the live change or say exactly what it needs. |

*Ambition is not graded. A small game you understand completely beats a large one you do not. Every year somebody submits something enormous that they cannot explain, and it is painful for both of us.*

## Pick a game

Each of these is big enough on its own, and each one still needs your house rule. Want something else? Battleship, Othello, 2048, Mancala and Dots and Boxes all work, and so does anything else built on a grid or a deck. Run it by me before you start and I will tell you whether it is big enough. It still cannot be your Project 1 idea.

### Connect Four

Two players drop pieces into a 6x7 grid. A piece falls to the lowest open row in its column. Four in a row horizontally, vertically or diagonally wins, and a full board is a draw.

* **Your array:** a 6x7 2D array of chars or Pieces.
* **The hard part:** checking all four directions after every move without stepping off the board. A computer opponent that blocks you is a strong addition.

### Minesweeper

A 9x9 grid hides 10 mines (16x16 with 40 if you want more). Revealing a square shows how many mines touch it, and revealing a zero opens its neighbors too. The player can flag suspected mines and wins by revealing every safe square.

* **Your array:** a 2D array of Cell objects, each knowing whether it holds a mine, whether it is revealed or flagged, and how many mines touch it.
* **The hard part:** placing mines without overlap, counting neighbors at the edges, opening a whole region of zeros, and making sure the first pick is never a mine.

### Checkers

An 8x8 board with 12 pieces each on the dark squares of the first three rows. Pieces move diagonally forward, capture by jumping, and become kings on the far row. You lose when you have no pieces left.

* **Your array:** an 8x8 2D array of Pieces, with null for an empty square.
* **The hard part:** validating moves. You do not need every official rule, but moving onto a piece, off the board, or backward with a normal piece must be rejected.

### Ultimate Tic-Tac-Toe

Nine small tic-tac-toe boards arranged in a 3x3. The square you mark decides which small board your opponent plays next. Win three small boards in a row to win. If you are sent to a finished board, you may play anywhere.

* **Your array:** a 3x3 2D array of SmallBoard objects, each holding its own 3x3 array.
* **The hard part:** tracking the active board, and printing all nine boards so they are readable in the console.

### Blackjack, or another card game

A deck, cards, and players who start with money and bet each round. Run out of money and you are out. Poker variants work too if you want more.

* **Your array:** a `Card[52]` deck with an int marking the top card, shuffled by swapping random positions. Each hand can be a small array or an ArrayList.
* **The hard part:** shuffling correctly, and an Ace that counts as 11 or 1.

### Dungeon crawler

A start, an exit, dead ends, and something that can end your run: traps, monsters, a health bar. The map is hidden in fog of war, so the player only sees the squares next to them.

* **Your array:** a 2D array of chars or Room objects, plus a `boolean[][]` for what has been seen.
* **The hard part:** making it big enough to matter. A 5x5 map scores low; this one lives or dies on complexity.

## Running your code

```
mvn compile -q                         # compile everything
mvn exec:java -Dexec.mainClass=Main    # or just run Main from your IDE
```

Your IDE's green Run button is fine too. The pom is here so the project compiles the same way on every machine.
