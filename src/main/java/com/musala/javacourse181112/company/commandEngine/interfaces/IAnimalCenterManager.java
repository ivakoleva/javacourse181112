package com.musala.javacourse181112.company.commandEngine.interfaces;

public interface IAnimalCenterManager {

    void registerCleansingCenter(String name);

    void registerAdoptionCenter(String name);

    void registerDog(String name, int age, int learnedCommands, String adoptionCenterName);

    void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName);

    void sendForCleansing(String adoptionCenterName, String cleansingCenterName);

    void cleanse(String cleansingCenterName);

    void adopt(String adoptionCenterName);

    void registerCastrationCenter(String name);

    void sendForCastration(String adoptionCenterName, String castrationCenterName);

    void castrate(String castrationCenterName);

    void castrationStatistics();

    void printStatistics();

}
