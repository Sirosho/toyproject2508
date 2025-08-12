
const DashboardPage = () => {

  // 초기화 함수
  const init = () => {
      console.log('대시보드 모듈이 로딩되었습니다.')
      // 오버레이 표시
      const overlay = document.createElement('div');
      overlay.innerHTML = `
      <div style="
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background-color: #f8f9fa;
        display: flex;
        justify-content: center;
        align-items: center;
        z-index: 9999;
      ">
        <div style="text-align: center;">
          <div style="
            width: 40px;
            height: 40px;
            border: 4px solid #e3e3e3;
            border-top: 4px solid #007bff;
            border-radius: 50%;
            animation: spin 1s linear infinite;
            margin: 0 auto 20px;
          "></div>
          <p style="color: #6c757d; margin: 0; font-family: Arial, sans-serif;">인증 확인 중...</p>
        </div>
      </div>
      <style>
        @keyframes spin {
          0% { transform: rotate(0deg); }
          100% { transform: rotate(360deg); }
        }
      </style>
    `;
      document.body.appendChild(overlay);

      // 잠깐 후 얼럿 표시 및 리다이렉트
      setTimeout(() => {
          showAlert('로그인이 필요한 페이지입니다. 로그인 페이지로 이동합니다.');
          setTimeout(() => {
              overlay.remove();
              window.location.href = '/login';
          }, 1500);
      }, 800);
  };

  return {init};

};

export default DashboardPage;