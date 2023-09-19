import com.test.hex.data.*;
import com.test.hex.edit.*;

import java.io.*;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        inputManager.init();
        DataManager dataManager = new DataManager();
        dataManager.shiftDelete(inputManager.data, 0, 1);
    }





}