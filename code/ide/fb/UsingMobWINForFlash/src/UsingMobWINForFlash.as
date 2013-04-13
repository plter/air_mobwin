package
{
	import com.plter.mobwin.MobWIN;
	
	import flash.display.Sprite;
	import flash.display.StageAlign;
	import flash.display.StageScaleMode;
	import flash.events.MouseEvent;
	
	public class UsingMobWINForFlash extends Sprite
	{
		public function UsingMobWINForFlash()
		{
			super();
			
			// 支持 autoOrient
			stage.align = StageAlign.TOP_LEFT;
			stage.scaleMode = StageScaleMode.NO_SCALE;
			
			MobWIN.mobWIN.addBannerToTop();			
			stage.addEventListener(MouseEvent.CLICK,stage_clickHandler);
		}
		
		
		private var top:Boolean = true;
		
		protected function stage_clickHandler(event:MouseEvent):void
		{
			if (top) 
			{
				MobWIN.mobWIN.addBannerToBottom();
				top=false;
			}else{
				MobWIN.mobWIN.addBannerToTop();
				top=true;
			}
		}
		
		
	}
}