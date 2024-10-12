
# Design Patterns Implementation

This repository contains Java implementations of various design patterns based on the assignments outlined in the project. These include:

1. **Adapter Pattern** - Audio Player
2. **Bridge Pattern** - Remote Control System
3. **Composite Pattern** - Menu System
4. **Decorator Pattern** - Pizza Ordering System
5. **Facade Pattern** - Smart Home System
6. **Flyweight Pattern** - Text Editor
7. **Proxy Pattern** - Online Learning Platform

## How to Run

To run the examples for each design pattern, navigate to the respective pattern’s `Main` class (e.g., `MusicPlayerApp` for the Adapter pattern) and execute it.

Each section below includes a description of the pattern and instructions on how to test the implementation.

---

## 1. Adapter Pattern - Audio Player

### Description:
The **Adapter pattern** allows an audio player to play multiple audio file formats (MP3, WAV, AAC) without modifying the existing MP3 player class. 

### How to Run:
1. Run the `Main` class to test the audio player.
2. You can see the player handle MP3, WAV, and AAC files via the `AudioAdapter`.

---

## 2. Bridge Pattern - Remote Control System

### Description:
The **Bridge pattern** allows for flexible control of various devices (TV, DVD, SoundSystem) using different remote controls. The abstraction (remote) and implementation (device) are decoupled.

### How to Run:
1. Run the `Main` class to see how the remote control works with multiple devices.
2. Switch between basic and advanced remotes to control the devices.

---

## 3. Composite Pattern - Menu System

### Description:
The **Composite pattern** is used to manage a hierarchical structure of menu items and submenus in a restaurant menu system.

### How to Run:
1. Run the `Main` class to see a multi-level menu system with menu items and submenus.
2. The app prints the structure of the restaurant's menu.

---

## 4. Decorator Pattern - Pizza Ordering System

### Description:
The **Decorator pattern** allows customers to customize their pizzas with various toppings in a flexible manner.

### How to Run:
1. Run the `Main` class to simulate ordering pizzas with various toppings.
2. Watch how the pizza price and description change as toppings are added.

---

## 5. Facade Pattern - Smart Home System

### Description:
The **Facade pattern** provides a simplified interface to a complex system of smart home devices (lights, thermostat, security, entertainment).

### How to Run:
1. Run the `Main` class to simulate arriving home, leaving home, or activating movie mode in a smart home.
2. The facade controls the interaction between all devices.

---

## 6. Flyweight Pattern - Text Editor

### Description:
The **Flyweight pattern** optimizes memory usage when rendering a large number of characters by reusing shared character objects.

### How to Run:
1. Run the `Main` class to see characters being inserted and rendered in different positions.
2. Verify that the same character objects are reused to save memory.

---

## 7. Proxy Pattern - Online Learning Platform

### Description:
The **Proxy pattern** implements lazy loading of video lectures in an online learning platform. Lectures are loaded only when they are played.

### How to Run:
1. Run the `Main` class to simulate loading and playing video lectures.
2. Observe that video lectures are only loaded when the play method is invoked.

---

## Conclusion
Each pattern demonstrates a unique solution to common design challenges. Feel free to explore the examples and adapt them to your needs.
