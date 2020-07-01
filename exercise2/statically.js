class Statically {
  //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class,
  //unless absolutely necessary.
  static #glue = 'Epoxy';
  jello = 'Jello';

  static moveAndShake() {
    console.log(`Never stagnate in life.  Be agile, change, and improve...`);
  }

  static stubborn() {
    moveAndShake();
    console.log("Please don't make me change... I just don't like it...");
  }

  static explain() {
  //Accessed the static method and the static variable by the class itself to work this code..
    Statically.stubborn();
    console.log(`${Statically.#glue}`);
    console.log(`In JS static methods can only be accessed with reference to a the Class on which they are declared.
    In Java, static methods can be accessed directly.`);
  }
}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method,
//defined in the class.  Do NOT remove the 'static' keyword from the explain() method.
const stats = new Statically();

Statically.moveAndShake();
Statically.stubborn();
Statically.explain();

//console.log(Statically.#glue);
//Unable to access the private static variable outside of the class.
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
