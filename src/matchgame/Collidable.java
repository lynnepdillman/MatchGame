package matchgame;

public interface Collidable
{
    public boolean didCollideTop(Block block);
    public boolean didCollideBottom(Block block);
    public boolean didCollideLeft(Block block);
    public boolean didCollideRight(Block block);
    
}
