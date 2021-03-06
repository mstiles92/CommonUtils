/*
 * This document is a part of the source code and related artifacts for StilesLib, an open source library that
 * provides a set of commonly-used functions for Bukkit plugins.
 *
 * http://github.com/mstiles92/StilesLib
 *
 * Copyright (c) 2014 Matthew Stiles (mstiles92)
 *
 * Licensed under the Common Development and Distribution License Version 1.0
 * You may not use this file except in compliance with this License.
 *
 * You may obtain a copy of the CDDL-1.0 License at http://opensource.org/licenses/CDDL-1.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the license.
 */

package com.mstiles92.plugins.stileslib.menu;

import com.mstiles92.plugins.stileslib.menu.menus.Menu;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

/**
 * An InventoryHolder used to hold a Menu along with its Inventory representation that will be displayed to the player.
 */
public class MenuInventoryHolder implements InventoryHolder {
    private Menu menu;
    private Inventory inventory;

    /**
     * Create an instance of MenuInventoryHolder to hold both a Menu and its Inventory representation.
     *
     * @param menu the Menu that the held Inventory represents
     * @param inventory the Inventory that represents the held Menu
     */
    public MenuInventoryHolder(Menu menu, Inventory inventory) {
        this.menu = menu;
        this.inventory = inventory;
    }

    /**
     * Get the Menu which is represented by the stored Inventory.
     *
     * @return the Menu from which the stored Inventory was generated
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * Get the Inventory that represents the stored Menu.
     *
     * @return the Inventory that was generated from the stored Menu
     */
    @Override
    public Inventory getInventory() {
        return inventory;
    }
}
