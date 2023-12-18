package org.max.homework1;

import org.junit.jupiter.api.BeforeAll;
import org.max.home.Game;


/**
 * абстрактный тест для парадокса Монти Холла
 */

public abstract class AbstractTestHome {
    static Game game;

    @BeforeAll
    static void init() {
        game = new Game();
    }
}