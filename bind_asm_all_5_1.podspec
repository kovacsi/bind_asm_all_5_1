Pod::Spec.new do |spec|
  spec.name                 = 'bind_asm_all_5_1'
  spec.version              = '0.0.8'
  spec.homepage             = "https://github.com/kovacsi/bind_asm_all_5_1/"
  spec.license              = { :type => 'EPL', :file => 'LICENSE.txt' }
  spec.author               = { "Migeran" => "support@migeran.com" }
  spec.summary              = 'Bind test for the asm-all-5.1.jar'
  spec.platform             = :ios, "8.4"
  spec.source               = { :git => 'https://github.com/kovacsi/bind_asm_all_5_1.git', :tag => '0.0.8'}
  spec.source_files         = ['xcode/bind_asm_all_5_1/*.{h,m}', 'src/main/java/**/*.java', 'lib/*.jar']
  spec.exclude_files        = ['**/AppViewController.java', '**/AppDelegate.{h,m}', '**/main.cpp']
  spec.requires_arc         = true
end
