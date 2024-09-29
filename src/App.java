import defenses.*;
import spells.EarthquakeSpell;
import spells.LightningSpell;
import spells.Spells;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class App {
    private final JComboBox<String> defenseDropdown = new JComboBox<>(Arrays.stream(Defenses.values())
            .map(Defenses::toString)
            .toArray(String[]::new));
    private final JComboBox<String> spellDropdown = new JComboBox<>(Arrays.stream(Spells.values())
            .map(Spells::toString)
            .toArray(String[]::new));
    private final JComboBox<Integer> spellTierDropdown = new JComboBox<>(range(11));
    private final JComboBox<Integer> defenseTierDropdown = new JComboBox<>((range(14)));
    private final JLabel label = new JLabel("Spells Required: 6", SwingConstants.CENTER);
    public App() {
        JFrame frame = new JFrame("Clash of Clans Calculator");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel defensePanel = createPanel(GridBagConstraints.NORTHWEST, "Defense: ", defenseDropdown, defenseTierDropdown);
        JPanel spellPanel = createPanel(GridBagConstraints.NORTHEAST, "Spell: ", spellDropdown, spellTierDropdown);

        defenseDropdown.addActionListener(e -> updateLabel());
        spellDropdown.addActionListener(e -> updateLabel());
        spellTierDropdown.addActionListener(e -> updateLabel());
        defenseTierDropdown.addActionListener(e -> updateLabel());


        frame.add(label, BorderLayout.CENTER);
        frame.add(defensePanel, BorderLayout.WEST);
        frame.add(spellPanel, BorderLayout.EAST);
        frame.setVisible(true);
    }

    JPanel createPanel(int anchor, String labelText, JComboBox<?> dropdown, JComboBox<Integer> tierDropdown) {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //Creates the first label
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = anchor;
        panel.add(new Label(labelText), gbc);

        //Adds the dropdown
        gbc.gridx = 1;
        panel.add(dropdown, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Tier: "), gbc);

        //Adds the tier dropdown
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(tierDropdown, gbc);

        //Return full panel
        return panel;
    }
    public static Integer[] range(int max) {
        Integer[] result = new Integer[max];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }
    void updateLabel() {
        int health = 0;
        switch ((String) Objects.requireNonNull(defenseDropdown.getSelectedItem())) {
            case "Air Defense" -> {
                AirDefense airDefense = new AirDefense();
                if (defenseTierDropdown.getItemCount() != airDefense.getMaxTier()) {
                    editDefenseTierDropdown(range(airDefense.getMaxTier()));
                }
                health = airDefense.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Air Sweeper" -> {
                AirSweeper airSweeper = new AirSweeper();
                if (defenseTierDropdown.getItemCount() != airSweeper.getMaxTier()) {
                    editDefenseTierDropdown(range(airSweeper.getMaxTier()));
                }
                health = airSweeper.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Cannon" -> {
                Cannon cannon = new Cannon();
                if (defenseTierDropdown.getItemCount() != cannon.getMaxTier()) {
                    editDefenseTierDropdown(range(cannon.getMaxTier()));
                }
                health = cannon.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Archer Tower" -> {
                ArcherTower archerTower = new ArcherTower();
                if (defenseTierDropdown.getItemCount() != archerTower.getMaxTier()) {
                    editDefenseTierDropdown(range(archerTower.getMaxTier()));
                }
                health = archerTower.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Mortar" -> {
                Mortar mortar = new Mortar();
                if (defenseTierDropdown.getItemCount() != mortar.getMaxTier()) {
                    editDefenseTierDropdown(range(mortar.getMaxTier()));
                }
                health = mortar.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Inferno Tower" -> {
                InfernoTower infernoTower = new InfernoTower();
                if (defenseTierDropdown.getItemCount() != infernoTower.getMaxTier()) {
                    editDefenseTierDropdown(range(infernoTower.getMaxTier()));
                }
                health = infernoTower.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Wizard Tower" -> {
                WizardTower wizardTower = new WizardTower();
                if (defenseTierDropdown.getItemCount() != wizardTower.getMaxTier()) {
                    editDefenseTierDropdown(range(wizardTower.getMaxTier()));
                }
                health = wizardTower.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Hidden Tesla" -> {
                HiddenTesla tesla = new HiddenTesla();
                if (defenseTierDropdown.getItemCount() != tesla.getMaxTier()) {
                    editDefenseTierDropdown(range(tesla.getMaxTier()));
                }
                health = tesla.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Bomb Tower" -> {
                BombTower bombTower = new BombTower();
                if (defenseTierDropdown.getItemCount() != bombTower.getMaxTier()) {
                    editDefenseTierDropdown(range(bombTower.getMaxTier()));
                }
                health = bombTower.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Xbow" -> {
                XBow xbow = new XBow();
                if (defenseTierDropdown.getItemCount() != xbow.getMaxTier()) {
                    editDefenseTierDropdown(range(xbow.getMaxTier()));
                }
                health = xbow.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Eagle Artillery" -> {
                EagleArtillery eagleArtillery = new EagleArtillery();
                if (defenseTierDropdown.getItemCount() != eagleArtillery.getMaxTier()) {
                    editDefenseTierDropdown(range(eagleArtillery.getMaxTier()));
                }
                health = eagleArtillery.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Scattershot" -> {
                Scattershot scattershot = new Scattershot();
                if (defenseTierDropdown.getItemCount() != scattershot.getMaxTier()) {
                    editDefenseTierDropdown(range(scattershot.getMaxTier()));
                }
                health = scattershot.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Builder Hut" -> {
                BuilderHut builderHut = new BuilderHut();
                if (defenseTierDropdown.getItemCount() != builderHut.getMaxTier()) {
                    editDefenseTierDropdown(range(builderHut.getMaxTier()));
                }
                health = builderHut.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Spell Tower" -> {
                SpellTower spellTower = new SpellTower();
                if (defenseTierDropdown.getItemCount() != spellTower.getMaxTier()) {
                    editDefenseTierDropdown(range(spellTower.getMaxTier()));
                }
                health = spellTower.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Monolith" -> {
                Monolith monolith = new Monolith();
                if (defenseTierDropdown.getItemCount() != monolith.getMaxTier()) {
                    editDefenseTierDropdown(range(monolith.getMaxTier()));
                }
                health = monolith.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Multi Archer Tower" -> {
                MultiArcherTower multiArcherTower = new MultiArcherTower();
                if (defenseTierDropdown.getItemCount() != multiArcherTower.getMaxTier()) {
                    editDefenseTierDropdown(range(multiArcherTower.getMaxTier()));
                }
                health = multiArcherTower.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
            case "Ricochet Cannon" -> {
                RicochetCannon ricochetCannon = new RicochetCannon();
                if (defenseTierDropdown.getItemCount() != ricochetCannon.getMaxTier()) {
                    editDefenseTierDropdown(range(ricochetCannon.getMaxTier()));
                }
                health = ricochetCannon.getHealth(defenseTierDropdown.getSelectedIndex() + 1);
            }
        }
        switch ((String) Objects.requireNonNull(spellDropdown.getSelectedItem())) {
            case "Lightning Spell" -> {
                LightningSpell lightningSpell = new LightningSpell();
                if (spellTierDropdown.getItemCount() != lightningSpell.getMaxTier()) {
                    editSpellTierDropdown(range(lightningSpell.getMaxTier()));
                }
                label.setText("Spells required: " + Math.ceilDivExact(health, lightningSpell.getDamage(spellTierDropdown.getSelectedIndex() + 1)));
            }
            case "Earthquake Spell" -> {
                EarthquakeSpell earthquakeSpell = new EarthquakeSpell();
                if (spellTierDropdown.getItemCount() != earthquakeSpell.getMaxTier()) {
                    editSpellTierDropdown(range(earthquakeSpell.getMaxTier()));
                }
                label.setText("Damage per spell: ~" + earthquakeSpell.getDamage(spellTierDropdown.getSelectedIndex() + 1, health));
            }
        }
    }
    private void editSpellTierDropdown(Integer[] values) {
        spellTierDropdown.removeAllItems();
        for (Integer i : values) {
            spellTierDropdown.addItem(i);
        }
        spellTierDropdown.setSelectedIndex(0);
    }
    private void editDefenseTierDropdown(Integer[] values) {
        defenseTierDropdown.removeAllItems();
        for (Integer i : values) {
            defenseTierDropdown.addItem(i);
        }
        defenseTierDropdown.setSelectedIndex(0);
    }
}
