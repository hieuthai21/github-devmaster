const toastTrigger = document.getElementById('liveToastBtn')
const toastLiveExample = document.getElementById('liveToast')

if (toastTrigger) {
  const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toastLiveExample)
  toastTrigger.addEventListener('click', () => {
    toastBootstrap.show()
  })
}
const toastTrigger1 = document.getElementById('liveToastBtn1')
const toastLiveExample1 = document.getElementById('liveToast1')

if (toastTrigger1) {
  const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toastLiveExample1)
  toastTrigger1.addEventListener('click', () => {
    toastBootstrap.show()
  })
}