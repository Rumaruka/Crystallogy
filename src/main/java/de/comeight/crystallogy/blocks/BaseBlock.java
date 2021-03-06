package de.comeight.crystallogy.blocks;

import de.comeight.crystallogy.Crystallogy;
import de.comeight.crystallogy.handler.CreativeTabHandler;
import de.comeight.crystallogy.util.enums.ToolClass;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BaseBlock extends Block {
    //-----------------------------------------------Attributes:--------------------------------------------


    //-----------------------------------------------Constructor:-------------------------------------------
    public BaseBlock(Material material, String id) {
        super(material);

        setUnlocalizedName(id);
        setRegistryName(Crystallogy.MOD_ID, id);
        setCreativeTab(CreativeTabHandler.crystallogyMainTab);
    }

    //-----------------------------------------------Set-, Get- Methods:------------------------------------
    public void setHarvestLevel(ToolClass toolClass, int level) {
        setHarvestLevel(toolClass.getName(), level);
    }


    //-----------------------------------------------Misc Methods:------------------------------------------

    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        if(willHarvest){
            return true;
        }
        return super.removedByPlayer(state, world, pos, player, willHarvest);
    }

    //-----------------------------------------------Events:------------------------------------------------

}