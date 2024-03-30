# Ejercicios_clasesabstractas_interfaces_chatgpt
Ejercicio de clases abstractas e interfaces de Java que me dio ChatGPT

Claro, aquí tienes un ejercicio conceptual que puedes implementar en Java utilizando clases abstractas e interfaces:

**Contexto:**
Imagina que estás desarrollando un sistema para administrar diferentes tipos de vehículos: coches y bicicletas. Además, quieres implementar algunas funcionalidades específicas para cada tipo de vehículo.

**Requerimientos:**

1. Debes tener una clase abstracta llamada `Vehiculo` que tenga los siguientes atributos y métodos:
   - Atributos:
     - `marca` (String)
     - `modelo` (String)
     - `año` (int)
   - Métodos abstractos:
     - `acelerar()`
     - `frenar()`

2. Debes tener una interfaz llamada `TransportePublico` que tenga el siguiente método:
   - `cobrarTarifa()`

3. Implementa una clase `Coche` que herede de `Vehiculo` e implemente `TransportePublico`. Esta clase debe tener un atributo adicional `numeroDePuertas` (int).

4. Implementa una clase `Bicicleta` que herede de `Vehiculo`. Esta clase no necesita implementar `TransportePublico`.

**Pasos:**

1. Crea la clase abstracta `Vehiculo` con los atributos y métodos abstractos mencionados.
2. Crea la interfaz `TransportePublico` con el método mencionado.
3. Implementa la clase `Coche` que herede de `Vehiculo` e implemente `TransportePublico`.
4. Implementa la clase `Bicicleta` que herede de `Vehiculo`.

**Desafío adicional:**

1. Crea una clase principal (`Main`) donde puedas instanciar objetos de tipo `Coche` y `Bicicleta`, y muestra cómo se pueden utilizar sus métodos.
