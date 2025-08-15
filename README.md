# 📝 Java Console Quiz App

## 📌 Objective
A simple **console-based quiz application** built using **Java**.  
The app displays multiple-choice questions, accepts user input, checks answers, and calculates the score.

---

## 🛠 Tools Used
- **Java (JDK 8 or higher)**
- **Console (Command Prompt / Terminal)**
- No external libraries required.

---

## 💡 Project Structure
The project contains:
1. **`Question` Class** – Represents each quiz question with:
   - Question text
   - Array of answer options
   - Index of the correct answer
   - A method to check if the given answer is correct
2. **`Quiz` Class** – Contains the main logic to run the quiz:
   - Creates a list of `Question` objects
   - Loops through each question
   - Displays options to the user
   - Accepts input and checks correctness
   - Keeps track of the score
   - Displays final results

---

## 🧠 Logic Explanation

### 1. Creating the `Question` Class
- **Purpose**: Store one question’s data and provide a method to check if the answer is correct.
- **Fields**:
  - `questionText` → Holds the actual question.
  - `options[]` → Stores multiple-choice answers.
  - `correctAnswerIndex` → The index (0-based) of the correct answer.
- **Constructor**: Used to set the values when a `Question` object is created.
- **Method**:
  - `isCorrect(int userChoiceIndex)` → Returns `true` if `userChoiceIndex` matches `correctAnswerIndex`.

---

### 2. Storing Multiple Questions
- Use `List<Question>` from the Java Collections Framework.
- Add `Question` objects into this list.
- Example:
```java
List<Question> questions = new ArrayList<>();
questions.add(new Question("Which language is used for Android?", new String[]{"Java","Python","C++","Swift"}, 0));
```

### 3. Displaying Questions
Use a for loop to iterate over the list.

For each Question:

- Print the question text.
- Print each option with a number (1 to n).

### 4. Taking User Input
Use Scanner to read user input from the console.

Subtract 1 from the user's answer to match the 0-based index.

Example:
```java
int userAnswer = scanner.nextInt() - 1; // Convert 1-based choice to 0-based index
```

### 5. Checking the Answer
Call the isCorrect(userAnswer) method.

- If true → Increase the score.
- Else → Move to the next question without increment.

### 6. Displaying Results
After all questions:

- Show Score = X / Total Questions
- Optionally display percentage or performance message.

---

## ▶ Running the Program

Save both `Question.java` and `Main.java` in the same folder.

**Compile:**
```bash
javac Question.java Main.java
```
**Run:**
```bash
java Main
```

---

## 📊 Example Output
```
Question 1: Which language is used for Android app development?
1. Java
2. Python
3. C++
4. Swift
Your answer: 1
Correct!

Question 2: What does HTML stand for?
1. HyperText Markup Language
2. HighText Machine Language
3. HyperTabular Markup Language
4. None of these
Your answer: 2
Wrong!

Your final score: 4 / 5
```

---

## 🚀 Key Points in Logic
- **Encapsulation**: Used private fields with getters/setters in Question class.
- **Data Structure**: `List<Question>` makes it easy to store and loop through questions.
- **User Input Handling**: Adjusting for 0-based index avoids off-by-one errors.
- **Answer Validation**: `equalsIgnoreCase()` and `trim()` help avoid space/case mismatches if answers were strings.
- **Scoring System**: Increment score only on correct answers.

---
