/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2014 The TridentSDK Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.tridentsdk.api.event.player;

import net.tridentsdk.api.entity.living.Player;

/**
 * Called when a player uses the tab key to complete the command
 *
 * @author The TridentSDK Team
 */
public class PlayerTabCompleteEvent extends PlayerEvent {

    private final String message;
    private final String[] suggestions;

    public PlayerTabCompleteEvent(Player player, String message) {
        super(player);

        this.message = message;
        this.suggestions = new String[]{};
    }

    public String getMessage() {
        return this.message;
    }

    public String[] getSuggestions() {
        return this.suggestions;
    }

    public void addSuggestion(String suggestion) {
        this.suggestions[this.suggestions.length] = suggestion;
    }
}
