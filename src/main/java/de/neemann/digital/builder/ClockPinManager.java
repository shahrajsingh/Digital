/*
 * Copyright (c) 2016 Helmut Neemann
 * Use of this source code is governed by the GPL v3 license
 * that can be found in the LICENSE file.
 */
package de.neemann.digital.builder;

/**
 * Manages the clock pin information.
 */
public class ClockPinManager {
    private int clockPin;

    /**
     * Returns the clock pin number.
     *
     * @return the clock pin number
     */
    public int getClockPin() {
        return clockPin;
    }

    /**
     * Sets the clock pin number.
     *
     * @param clockPin the clock pin number
     */
    public void setClockPin(int clockPin) {
        if (clockPin > 0)
            this.clockPin = clockPin;
    }
}