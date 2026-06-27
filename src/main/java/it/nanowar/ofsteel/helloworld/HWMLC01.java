int foo = 2;

void songRefrain() {
  for (var i = 0; i < foo; i++) {
    IO.println("Hello World!");
  }

  var pippo = 0;
  while (pippo < foo) {
    IO.println("Hello World!");
    pippo++;
  }
}

void main() {
  IO.println("Hello World Programmer Start");
  songRefrain();
  IO.println("Program Finished!");
  falseMethod();
}

/*
 * If I may introduce a bug, the JVM will handle it for me
 * ensuring both security and portability.
 * Then I'll write my code once, and run it everywhere!
 * With Static and Strong Typing, will let my programs be type safe!
 */

void falseMethod() {
  var metal = false;
  if (metal == false) {
    String joeyDeCaio = null;
    joeyDeCaio.length();
  }
}