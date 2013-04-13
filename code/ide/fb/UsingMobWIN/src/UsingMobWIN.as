package
{
	import com.plter.mobwin.MobWIN;
	
	import flash.display.Sprite;
	import flash.display.StageAlign;
	import flash.display.StageScaleMode;
	
	public class UsingMobWIN extends Sprite
	{
		public function UsingMobWIN()
		{
			super();
			
			// 支持 autoOrient
			stage.align = StageAlign.TOP_LEFT;
			stage.scaleMode = StageScaleMode.NO_SCALE;
			
			MobWIN.mobWIN.addBannerToTop();
		}
	}
}