package fr.tyr.components.character.style;

import fr.tyr.components.character.identity.Origin;
import fr.tyr.components.classic.ImageComponent;
import fr.tyr.game.enums.MouseButtons;
import fr.tyr.resources.images.Images;
import fr.tyr.tools.Vector2D;

public class Skin extends ImageComponent {
    SkinEnum skin;
    /**
     * Create a Skin
     * @param image The image of the Skin
     */
    public Skin(SkinEnum skin) {
        super(skin.getImage());
        this.skin = skin;
    }

    /**
     * Create a Skin
     * @param image The image of the Skin
     * @param position The component position
     */
    public Skin(SkinEnum skin, Vector2D position) {
        super(skin.getImage(), position);
        this.skin = skin;
    }

    /**
     * Create a Skin
     * @param image The image of the Skin
     * @param position The component position
     * @param size The component size
     * @param center Is the image centered
     */
    public Skin(SkinEnum skin, Vector2D position, Vector2D size, boolean center) {
        super(skin.getImage(), position, size, center);
        this.skin = skin;
    }

    /**
     *
     * @param aps The current number of ticks per second
     */
    @Override
    public void tick(int aps) {

    }

    /**
     *
     * @param button The button that was clicked
     */
    @Override
    public void onClick(MouseButtons button) {

    }

    /**
     *
     */
    @Override
    public void onHover() {

    }

    /**
     *
     */
    @Override
    public void onHoverLost() {

    }

    /**
     *
     * @param size The new size of the window
     */
    @Override
    public void onWindowResized(Vector2D size) {

    }
    public String getName(){
        return skin.getName();
    }
    public Images getImage() {
        return skin.getImage();
    }
    public Origin getOrigin(){
        return skin.getOrigin();
    }
}
